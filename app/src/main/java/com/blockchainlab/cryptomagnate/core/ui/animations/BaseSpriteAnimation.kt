package com.blockchainlab.cryptomagnate.core.ui.animations

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
    frameSize: Dp,
    columns: Int,
    rows: Int,
    frameCount: Int = columns * rows,
    frameDurationMs: Long = 150,
) {
    val frameWidthPx = imageBitmap.width / columns
    val frameHeightPx = imageBitmap.height / rows

    val frames = remember(imageBitmap, columns, rows, frameCount) {
        List(frameCount.coerceAtMost(columns * rows)) { index ->
            val col = index % columns
            val row = index / columns

            val bitmap = ImageBitmap(frameWidthPx, frameHeightPx)
            val canvas = Canvas(bitmap)
            val paint = Paint()

            canvas.drawImageRect(
                image = imageBitmap,
                srcOffset = IntOffset(col * frameWidthPx, row * frameHeightPx),
                srcSize = IntSize(frameWidthPx, frameHeightPx),
                dstOffset = IntOffset(0, 0),
                dstSize = IntSize(frameWidthPx, frameHeightPx),
                paint = paint
            )
            bitmap
        }
    }

    var currentFrame by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(frameDurationMs)
            currentFrame = (currentFrame + 1) % frames.size
        }
    }

//    //Todo Такой метод тож норм но currentFrame приходится убирать в кеш канваса.
//    val infiniteTransition = rememberInfiniteTransition(label = "sprite")
//    val progress by infiniteTransition.animateFloat(
//        initialValue = 0f,
//        targetValue = 1f,
//        animationSpec = infiniteRepeatable(
//            animation = tween((frameCount * frameDurationMs).toInt(), easing = LinearEasing),
//            repeatMode = RepeatMode.Restart
//        ), label = "spriteProgress"
//    )
//    val currentFrame = (progress * frameCount).toInt().coerceIn(0, frameCount - 1)

    Box(
        modifier = modifier
            .size(frameSize)
            .drawWithCache {
                onDrawWithContent {
                    drawContent()
                    // Масштабируем кадр до нужного размера
                    drawImage(
                        image = frames[currentFrame],
                        dstSize = IntSize(size.width.toInt(), size.height.toInt())
                    )
                }
            }
    ) {
        Text("HELLOO", color = Color.Magenta)
    }
}

@Preview
@Composable
private fun BaseSpriteAnimationPreview() {
    BasePreview(background = Color.Transparent) {
        BaseSpriteAnimation(
            imageBitmap = BaseIcons.MockImageBitmap.toBitmap(),
            frameSize = 512.dp,
            columns = 4,
            rows = 2,
            frameDurationMs = 90
        )
    }
}
