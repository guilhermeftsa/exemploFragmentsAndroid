package br.com.guilherme.exemplofragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.support.v4.app.Fragment
import android.view.ViewGroup

class DisciplinasFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.fragment_disciplinas, container, false)
    }
}