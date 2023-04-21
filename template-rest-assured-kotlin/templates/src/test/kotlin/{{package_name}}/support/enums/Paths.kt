package {{package_name}}.support.enums

import {{package_name}}.support.utils.GetVariable

enum class Paths(val path: String) {
    BASE_URL(GetVariable.getProp("BaseUrl")), POST_USER("/usuarios");

}