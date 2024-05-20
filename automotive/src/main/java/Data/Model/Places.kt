package Data.Model

import android.content.Intent
import androidx.core.net.toUri

data class Places(
    val Id  : Int,
    val location_name : String,
    val latitude : Double,
    val longitude : Double,
    val description : String,
    val Distance : Int,
    val Address : String,
    val Image : String,
    val Hours : String,
    val Ticket : Int
)

fun Places.toIntent(action: String): Intent {
    return Intent(action).apply {
        data = "geo:$latitude,$longitude".toUri()

    }
}
