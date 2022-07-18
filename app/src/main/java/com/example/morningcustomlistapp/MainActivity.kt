package com.example.morningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var myUsersList:ListView ?= null
    var users:ArrayList<User> ?= null
    var adapter:CustomAdapter ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myUsersList = findViewById(R.id.mListUsers)
        users = ArrayList()
        adapter = CustomAdapter(this,users!!)
//        start creating users
        var user1 = User(R.mipmap.imageone,"Hezron Ruto","0795124927")
        var user2 = User(R.mipmap.imagetwo,"Harun kariuki","0795124927")
        var user3 = User(R.mipmap.imagethree,"Flyvia Chepng'etich","0795124927")
        var user4 = User(R.mipmap.imageone,"Hezekiah Kabogo","0795124927")
        var user5 = User(R.mipmap.imagetwo,"Margaret Chepkwony","0795124927")
        var user6 = User(R.mipmap.imagethree,"Johnstone Chepkwony","0795124927")
        var user7 = User(R.mipmap.imagetwo,"Eugene Mwangi","0795124927")
        var user8 = User(R.mipmap.imagethree,"Chege Eugene","0795124927")
        var user9 = User(R.mipmap.imagetwo,"King Wanyanyama","0795124927")
        var user10 = User(R.mipmap.imageone,"Festus Kipngeno","0795124927")
        var user11 = User(R.mipmap.imagetwo,"Trazy Cherop","0795124927")
        var user12 = User(R.mipmap.imageone,"Prudence Chepchumba","0795124927")
//        Add the created users to the array list
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
        users!!.add(user6)
        users!!.add(user7)
        users!!.add(user8)
        users!!.add(user9)
        users!!.add(user10)
        users!!.add(user11)
        users!!.add(user12)
//        Assign our custom Adapter to the list view
        myUsersList!!.adapter = adapter!!





    }
}