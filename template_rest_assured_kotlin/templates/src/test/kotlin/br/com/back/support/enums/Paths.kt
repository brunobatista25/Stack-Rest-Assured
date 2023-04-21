package br.com.back.support.enums

import br.com.back.support.utils.GetVariable

enum class Paths(val path: String) {
    BASE_URL(GetVariable.getProp("BaseUrl")), POST_USER("/usuarios");

}