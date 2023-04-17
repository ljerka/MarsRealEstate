package com.example.android.marsrealestate

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

// kad xml ima atribut imageUrl onda će e izvršiti ovaj binding adapter
@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let{
        val imgUri = it.toUri().buildUpon().scheme("https").build()

        // koristimo glide library za prikaz slika, to je commuity lib, a ne googleov
        Glide.with(imgView.context)
            .load(imgUri)
            .into(imgView)
    }

}