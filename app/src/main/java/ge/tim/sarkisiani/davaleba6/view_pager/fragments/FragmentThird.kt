package ge.tim.sarkisiani.davaleba6.view_pager.fragments

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import ge.tim.sarkisiani.davaleba6.view_pager.R


class FragmentThird: Fragment(R.layout.fragment_third){
    private lateinit var editTextNote: EditText
    private lateinit var textNote: TextView
    private lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}