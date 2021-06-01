package com.example.oryzapedia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.oryzapedia.R
import com.example.oryzapedia.entity.Tanaman

class ListAdapter(private val listFruit: ArrayList<Tanaman>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemCliked(data: Tanaman)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvEnglish: TextView = itemView.findViewById(R.id.tv_item_english)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(
            R.layout.item_row_fruit,
            viewGroup,
            false
        )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFruit.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tanaman = listFruit[position]
        Glide.with(holder.itemView.context)
            .load(tanaman.photo)
            //.apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = tanaman.name
        holder.tvEnglish.text = tanaman.english_name
        holder.tvDetail.text = tanaman.detail
        holder.btnFavorite.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Favorite " + listFruit[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemCliked(listFruit[holder.adapterPosition])
        }
    }


}