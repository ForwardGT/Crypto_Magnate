package com.blockchainlab.cryptomagnate.core.ui.animations

import android.R.attr.x
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.blockchainlab.cryptomagnate.core.ui.preview.BasePreview
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseIcons
import com.blockchainlab.cryptomagnate.core.ui.resources.toBitmap
import kotlinx.coroutines.delay

@Composable
fun BaseSpriteAnimation(
    modifier: Modifier = Modifier,
    imageBitmap: ImageBitmap,
    sizeImage: Dp,
    frameCount: Int,
    frameDurationMs: Long = 90,
) {
    // нарезаем кадры один раз
    // Попробовать без derivedStateOf если при реактивной замене картинки не изменится ничего
    val frames by remember(frameCount, frameDurationMs, sizeImage, imageBitmap) {
        derivedStateOf {
            List(frameCount) { index ->
                val frameWidth = imageBitmap.width / frameCount
                val frameHeight = imageBitmap.height
                val bitmap = ImageBitmap(frameWidth, frameHeight)
                val canvas = Canvas(bitmap)
                val paint = Paint()

                canvas.drawImageRect(
                    image = imageBitmap,
                    srcOffset = IntOffset(index * frameWidth, 0),
                    srcSize = IntSize(frameWidth, frameHeight),
                    dstOffset = IntOffset(0, 0),
                    dstSize = IntSize(frameWidth, frameHeight),
                    paint = paint
                )
                bitmap
            }
        }
    }

    var currentFrame by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(frameDurationMs)
            currentFrame = (currentFrame + 1) % frames.size
        }
    }

    Column(
        Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = modifier
                .size(sizeImage)
                .offset(x = x.dp)
                .drawWithCache {
                    val cachedFrames = frames
                    onDrawWithContent {
                        drawContent()
                        drawImage(
                            cachedFrames[currentFrame],
                            dstSize = IntSize(size.width.toInt(), size.height.toInt())
                        )
                    }
                }
        )
    }
}

@Preview
@Composable
private fun BaseSpriteAnimationPreview() {
    BasePreview(background = Color.Transparent) {
        BaseSpriteAnimation(
            imageBitmap = BaseIcons.MockImageBitmap.toBitmap(),
            frameCount = 4,
            sizeImage = 128.dp
        )
    }
}
