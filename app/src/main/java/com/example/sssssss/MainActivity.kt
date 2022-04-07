import com.example.sssssss.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var obraz=1
        val obrazek = findViewById<ImageView>(R.id.imageView)
        obrazek.setOnClickListener {
            if (obraz==1){
                obraz=2
                obrazek.setImageResource(R.drawable.cat)
            }
            else{
                obraz=1
                obrazek.setImageResource(R.drawable.caat)
            }
        }
    }
}