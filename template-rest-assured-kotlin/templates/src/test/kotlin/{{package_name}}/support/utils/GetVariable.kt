package {{package_name}}.support.utils

import java.util.Properties
import {{package_name}}.support.utils.GetVariable
import java.io.FileInputStream
import java.io.IOException

object GetVariable {
    private const val DATA_CONFIG = "src/test/resources/"
    private var properties: Properties? = null
    @JvmStatic
    fun getProp(value: String?): String {
        try {
            if (properties == null) {
                properties = Properties()
                properties!!.load(FileInputStream(DATA_CONFIG + environment + ".properties"))
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return properties!!.getProperty(value)
    }

    val environment: String
        get() {
            var environments = System.getProperty("environment")
            if (environments == null) {
                environments = "homolog"
            }
            return environments
        }
}