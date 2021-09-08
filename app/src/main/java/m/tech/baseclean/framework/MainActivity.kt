package m.tech.baseclean.framework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import m.tech.baseclean.R
import m.tech.baseclean.framework.presentation.common.ActivityObserver

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), ActivityObserver {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //TODO: change name navhost


    }
}