package com.example.native_camera.checking
import okhttp3.OkHttpClient
import okhttp3.Request
class AutoChecking {
    companion object {
        public fun sendCheckingResult(){
//            val url = URL("http://localhost:1337/api/default-layouts")
//            val connection = url.openConnection() as HttpURLConnection
//            connection.requestMethod = "GET"
//            connection.connect()
//            val responseCode = connection.responseCode
//            println(connection.)
            val client = OkHttpClient()

            try {
                val request = Request.Builder()
                    .url("http://localhost:1337/api/default-layouts")
                    .build()
                val response = client.newCall(request).execute()
                val responseBody = response.body?.string()
                println(responseBody)
            }catch (error: Exception){
                println(error)
            }

        }
    }
}