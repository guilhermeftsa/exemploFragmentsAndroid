package br.com.guilherme.exemplofragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupviewPager()
        setupBottomNavigationView()
    }

    private fun setupviewPager(){
        viewPager.adapter = MenuAdapter(supportFragmentManager)

        viewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageSelected(position: Int) {
               val menu = bottomNavigationView.menu.getItem(position)
                bottomNavigationView.selectedItemId = menu.itemId
            }
        })
    }

    private fun setupBottomNavigationView(){
        bottomNavigationView.setOnNavigationItemSelectedListener {menu->
            when(menu.itemId){
                R.id.favorites->{
                    viewPager.currentItem = 0
                    viewPager.setCurrentItem(MenuAdapter.favoritos, true)
                }
                R.id.schedule->{
                    viewPager.setCurrentItem(MenuAdapter.agenda, true)
                }
                R.id.music->{
                    viewPager.setCurrentItem(MenuAdapter.musicas, true)
                }
                else->{
                Log.d("TAG","outra coisa selecionado")
            }
        }
            true
        }
    }
}
