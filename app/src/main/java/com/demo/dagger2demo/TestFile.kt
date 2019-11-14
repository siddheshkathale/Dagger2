package com.demo.dagger2demo

data class TestFile(val id:Int,
                    val name:String){
    override fun toString(): String {
        return "TestFile(id=$id, name='$name')"
    }
}