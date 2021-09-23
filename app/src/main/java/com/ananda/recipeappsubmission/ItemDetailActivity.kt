package com.ananda.recipeappsubmission

import android.R.attr.label
import android.content.ClipData
import android.content.ClipboardManager
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.text.HtmlCompat
import com.bumptech.glide.Glide


class ItemDetailActivity : AppCompatActivity() {
    private var list: Recipe = Recipe()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

        val pos = intent.getIntExtra("CUR_POS", 0)
        list = RecipesData.getData(pos)

        val tvName: TextView = findViewById(R.id.tv_detail_name)
        val tvBahan: TextView = findViewById(R.id.tv_detail_bahan)
        val tvCara: TextView = findViewById(R.id.tv_detail_cara)
        val imgPhoto: ImageView = findViewById(R.id.img_detail)

        Glide.with(this)
            .load(list.foodPhoto)
            .into(imgPhoto)

        tvName.text = HtmlCompat.fromHtml(list.name, HtmlCompat.FROM_HTML_MODE_LEGACY)
        tvBahan.text = HtmlCompat.fromHtml(list.foodBahan, HtmlCompat.FROM_HTML_MODE_LEGACY)
        tvCara.text = HtmlCompat.fromHtml(list.foodInstruction, HtmlCompat.FROM_HTML_MODE_LEGACY)

        val favBtn: Button = findViewById(R.id.btn_set_favorite)
        val shareBtn: Button = findViewById(R.id.btn_set_share)

        favBtn.setOnClickListener { Toast.makeText(this, "Added " + list.name + " to Favorite", Toast.LENGTH_SHORT).show() }
        shareBtn.setOnClickListener { Toast.makeText(this, "Food name copied to clipboard", Toast.LENGTH_SHORT).show() }

        val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText(list.name, list.name)
        clipboard.setPrimaryClip(clip)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}