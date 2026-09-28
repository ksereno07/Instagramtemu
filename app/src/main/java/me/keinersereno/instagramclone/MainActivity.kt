package me.keinersereno.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.keinersereno.instagramclone.ui.screens.FeedScreen
import me.keinersereno.instagramclone.ui.theme.InsagramcloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InsagramcloneTheme {
                FeedScreen()
            }
        }
    }
}