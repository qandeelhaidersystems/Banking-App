package com.example.mvipractise.core.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseFragment<V : ViewModel?> : Fragment() {

    private var mRootView: View? = null

    private var mViewModel: V? = null

//    abstract fun getBindingVariable(): Int

    abstract fun getViewModels(): V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = getViewModels()
        setHasOptionsMenu(false)
    }

}