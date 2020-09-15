package tv.mycujoo.simplelibapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tv.mycujoo.simplelib.SimpleLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val add = SimpleLib().add(1, 2)
        println(add)
    }
}