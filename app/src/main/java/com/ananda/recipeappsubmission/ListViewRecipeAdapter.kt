package com.ananda.recipeappsubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListViewRecipeAdapter(private val listRecipes: ArrayList<Recipe>) : RecyclerView.Adapter<ListViewRecipeAdapter.ListViewViewHolder>() {
    var curPos: Int = 0

    class ListViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvInfo: TextView = itemView.findViewById(R.id.tv_item_info)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

        init {
            itemView.setOnClickListener {
                val moveIntent = Intent(itemView.context, ItemDetailActivity::class.java)
                moveIntent.putExtra("CUR_POS", adapterPosition)
                itemView.context.startActivity(moveIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_recipe, parent, false)
        return ListViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewViewHolder, position: Int) {
        val recipe = listRecipes[position]
        curPos = position

        Glide.with(holder.itemView.context)
            .load(recipe.foodPhoto)
            .into(holder.imgPhoto)

        holder.tvName.text = recipe.name
        holder.tvInfo.text = "${recipe.cookTime} | ${recipe.foodPortion}"
    }

    override fun getItemCount(): Int {
        return listRecipes.size
    }
}