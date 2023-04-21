package {{packame_name}}.support.enums

import {{packame_name}}.support.utils.GetVariable

enum class Paths(val path: String) {
    BASE_URL(GetVariable.getProp("BaseUrl")), POST_USER("/usuarios");

}