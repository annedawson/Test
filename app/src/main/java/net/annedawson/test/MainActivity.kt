package net.annedawson.test

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Log.d("TEST1", "in setContent")
            MainScreen()
        }
    }
}


@Composable
fun MainScreen() {


    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Log.d("TEST1", "in MainScreen before Column")
        Column(
            modifier = Modifier
                .padding(64.dp)
                .fillMaxSize(1f),
            verticalArrangement = Arrangement.Bottom
        ) {
            Log.d("TEST1", "in MainScreen in ColumnScope")

            Text(
                text = "Hello!",
                modifier = Modifier.padding(bottom = 16.dp),
                //color = Color.Green,
                style = TextStyle(color = Color.Blue)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = { Text("Name") }
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}