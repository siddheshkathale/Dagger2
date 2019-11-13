package com.demo.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.json.JSONArray
import org.json.JSONObject
import java.io.FileWriter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obj = JSONObject()
        obj.put("Name", "crunchify.com")
        obj.put("Author", "App Shah")

        val company = JSONArray()
        company.put("Compnay: eBay")
        company.put("Compnay: Paypal")
        company.put("Compnay: Google")
        obj.put("Company List", company)

        // try-with-resources statement based on post comment below :)
        FileWriter("/Users/<username>/Documents/file1.txt").use({ file ->
            file.write(obj.toString())
            println("Successfully Copied JSON Object to File...")
            println("\nJSON Object: $obj")
        })
    }

    fun testUpload() {

        var i =  1
        var f =  2000

        var p  = 10 + 10

        var ip = 1 - 3

    }


}
