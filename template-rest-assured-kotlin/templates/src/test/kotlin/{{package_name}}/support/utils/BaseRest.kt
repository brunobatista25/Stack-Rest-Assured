package {{package_name}}.support.utils

import io.restassured.specification.RequestSpecification
import io.restassured.RestAssured
import io.restassured.response.Response

object BaseRest {
    private var request: RequestSpecification? = null
    var response: Response? = null


    fun initRest() {
        RestAssured.useRelaxedHTTPSValidation()
        request = RestAssured.given()
    }

    fun initRestWithProxy() {
        RestAssured.useRelaxedHTTPSValidation()
        RestAssured.proxy("proxy", 8080)
        request = RestAssured.given()
    }

    fun log() {
        RestAssured.given().then().log().all()
    }

    fun setPath(baseUri: String?, path: String?) {
        if (request == null) {
            initRest()
        }
        request!!.baseUri(baseUri)
        request!!.basePath(path)
        RestAssured.useRelaxedHTTPSValidation()
    }

    fun setContent(content: String?) {
        if (request == null) {
            initRest()
        }
        request!!.contentType(content)
    }

    fun setHeader(contentHeader: MutableMap<String, String>) {
        request!!.headers(contentHeader)
    }

    fun setPathParams(params: Map<String?, String?>?) {
        request!!.pathParams(params)
    }

    fun setParams(params: Map<String?, *>?) {
        request!!.params(params)
    }

    fun setQueryParams(queryParams: Map<String?, *>?) {
        request!!.queryParams(queryParams)
    }

    fun setFormParams(formParams: Map<String?, *>?) {
        request!!.formParams(formParams)
    }

    fun setBody(contentBody: String?) {
        request!!.body(contentBody)
    }

    fun getRequest() {
        response = request!!.get()
    }

    fun postRequest() {
        response = request!!.post()
    }

    fun deleteRequest() {
        response = request!!.delete()
    }

    fun putRequest() {
        response = request!!.put()
    }

    fun patchRequest() {
        response = request!!.patch()
    }

}