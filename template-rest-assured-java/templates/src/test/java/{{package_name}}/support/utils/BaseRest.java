package{{package_name}}.support.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class BaseRest {
    private static RequestSpecification request;
    private static Response response;

    public static void initRest(){
        RestAssured.useRelaxedHTTPSValidation();
        request = RestAssured.given();
    }

    public static void initRestWithProxy(){
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.proxy("proxy", 8080);
        request = RestAssured.given();
    }

    public static void log(){
        RestAssured.given().then().log().all();
    }

    public static void setPath(String baseUri, String path){
        if ( request == null){
            initRest();
        }
        request.baseUri(baseUri);
        request.basePath(path);
        RestAssured.useRelaxedHTTPSValidation();
    }

    public static void setContent(String content){
        if ( request == null){
            initRest();
        }
        request.contentType(content);
    }

    public static void setHeader(Map<String, String> contentHeader){
        request.headers(contentHeader);
    }

    public static void setPathParams(Map<String, String> params){
        request.pathParams(params);
    }

    public static void setParams(Map<String, ?> params){
        request.params(params);
    }

    public static void setQueryParams(Map<String, ?> queryParams){
        request.queryParams(queryParams);
    }

    public static void setFormParams(Map<String, ?> formParams){
        request.formParams(formParams);
    }

    public static void setBody(String contentBody){
        request.body(contentBody);
    }

    public static void getRequest(){
        response = request.get();
    }

    public static void postRequest(){
        response = request.post();
    }

    public static void deleteRequest(){
        response = request.delete();
    }

    public static void putRequest(){
        response = request.put();
    }

    public static void patchRequest(){
        response = request.patch();
    }

    public static Response getResponse(){
        return response;
    }

}
