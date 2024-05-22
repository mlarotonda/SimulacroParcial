package com.example.simulacroparcial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import com.example.simulacroparcial.databinding.ActivityMainBinding
import com.example.simulacroparcial.fragments.AdoptionsFragment
import com.example.simulacroparcial.fragments.CreatePostFragment
import com.example.simulacroparcial.fragments.FavoritesFragment
import com.example.simulacroparcial.fragments.HomeFragment
import com.example.simulacroparcial.ui.theme.SimulacroParcialTheme

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        /*binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> setCurrentFragment(HomeFragment())
                R.id.favorites -> setCurrentFragment(FavoritesFragment())
                R.id.adoptions -> setCurrentFragment(AdoptionsFragment())
                R.id.create_post -> setCurrentFragment(CreatePostFragment())
            }
            true
        }*/
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimulacroParcialTheme {
        Greeting("Android")
    }
}