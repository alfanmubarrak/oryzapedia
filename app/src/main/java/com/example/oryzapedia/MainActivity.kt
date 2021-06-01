package com.example.oryzapedia

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oryzapedia.adapter.ListAdapter
import com.example.oryzapedia.entity.Tanaman
import com.example.oryzapedia.entity.TanamanData
import com.miguelcatalan.materialsearchview.MaterialSearchView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var searchView: MaterialSearchView

    private lateinit var rvFruit: RecyclerView
    private var list: ArrayList<Tanaman> = arrayListOf()
    private var tanamanData: ArrayList<Tanaman> = TanamanData.listData

    private var title: String = "Oryzapedia"

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        setActionBarTitle(title)
        searchView  = findViewById(R.id.search_view)
        searchView.setCursorDrawable(R.drawable.custom_cursor)
        searchView.setEllipsize(true)


        rvFruit = findViewById(R.id.rv_fruits)
        rvFruit.setHasFixedSize(true)

        list.addAll(tanamanData)
        showRecyclerList()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        val menuItem: MenuItem = menu.findItem(R.id.action_search)
        searchView.setMenuItem(menuItem)

        searchView.setOnQueryTextListener(object : MaterialSearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                if (newText!!.isNotEmpty()) {

                    list.clear()
                    val search = newText.toLowerCase(Locale.getDefault())
                    tanamanData.forEach {

                        if (it.name.toLowerCase(Locale.getDefault()).contains(search)) {
                            list.add(it)
                        }
                    }

                    rvFruit.adapter!!.notifyDataSetChanged()
                }

                else {

                    list.clear()
                    list.addAll(tanamanData)
                    rvFruit.adapter!!.notifyDataSetChanged()
                }

                return true
            }

        })

        return super.onCreateOptionsMenu(menu)
    }

    override fun onBackPressed() {
        if(searchView.isSearchOpen) {
            searchView.closeSearch()
        } else {
            super.onBackPressed()
        }
    }

   override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {

        when(selectedMode) {

            R.id.action_list -> {
                showRecyclerList()
            }
        }

    }

    private fun showRecyclerList() {
        rvFruit.layoutManager = LinearLayoutManager(this)
        val listFruitAdapter = ListAdapter(list)
        rvFruit.adapter = listFruitAdapter

        listFruitAdapter.setOnItemClickCallback(object : ListAdapter.OnItemClickCallback {
            override fun onItemCliked(data: Tanaman) {

                val detailActivityIntent =
                    Intent(this@MainActivity, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_IMAGE, data.photo)
                        putExtra(DetailActivity.EXTRA_NAME, data.name)
                        putExtra(DetailActivity.EXTRA_ENGLISH, data.english_name)
                        putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
                    }
                showSelectedFruit(data)
                startActivity(detailActivityIntent)
            }
        })
    }

    private fun showSelectedFruit(Tanamann: Tanaman) {

        val tanaman: String = Tanamann.name
        Toast.makeText(this, "Memilih $tanaman", LENGTH_SHORT).show()
    }
}