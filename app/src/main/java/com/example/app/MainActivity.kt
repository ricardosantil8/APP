package com.example.app

import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.app.dataclasses.Tema
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var myList: ArrayList<Tema>

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myList = ArrayList<Tema>()

        for (i in 0 until 5)
        {
            myList.add(Tema(titulo = "Titanic", subtitulo = "Drama", nome = "Dicaprio"))
        }
       // recycler_view.adapter = LineAdapter(myList)
        //recycler_view.layoutManager = LinearLayoutManager (this)
    }
}

