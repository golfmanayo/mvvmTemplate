package com.nattawood.mvvmtemplate.ui.main

import com.nattawood.mvvmtemplate.R
import com.nattawood.mvvmtemplate.databinding.FragmentMainBinding
import com.nattawood.mvvmtemplate.ui.base.BaseFragment
import org.koin.android.ext.android.inject

class MainFragment : BaseFragment<FragmentMainBinding>() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by inject()

    override fun getLayout(): Int = R.layout.fragment_main

    override fun onViewModelBinding() {
        binding.vm = this.viewModel
    }
}