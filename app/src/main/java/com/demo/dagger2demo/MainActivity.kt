package com.demo.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import java.io.FileWriter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testUpload()

    }

    fun testUpload() {

        var lt = ArrayList<TestFile>()

        lt.add(TestFile(1,"Siddhesh"))
        lt.add(TestFile(2,"Naresh"))
        lt.add(TestFile(3,"Navin"))
        lt.add(TestFile(4,"Mayur"))
        lt.add(TestFile(5,"Roshan"))

        var testFile = TestFile(4,"Mayur")

        Log.i("@@"," testFile:: "+testFile.toString())

        Log.i("@@"," testFile contains:: "+lt.contains(testFile))

        if(lt.indexOf(testFile) != -1){
            Log.i("@@"," testFile index:: "+lt.indexOf(testFile))
        }

    }


}
