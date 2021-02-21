package com.dicoding.tourismapp.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.tourismapp.R
import com.dicoding.tourismapp.favorite.databinding.ActivityFavoriteBinding
import com.dicoding.tourismapp.favorite.di.favoriteModule
import org.koin.core.context.loadKoinModules

class FavoriteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        supportActionBar?.title = getString(R.string.title_favorite)
        setContentView(binding.root)
    }
}