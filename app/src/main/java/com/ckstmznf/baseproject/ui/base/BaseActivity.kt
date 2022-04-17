package com.ckstmznf.baseproject.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<D : ViewDataBinding>(
    @LayoutRes
    private val layoutRedId : Int) : AppCompatActivity() {

    protected lateinit var binding : D

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        binding = DataBindingUtil.setContentView(this, layoutRedId)
        binding.lifecycleOwner = this
    }
}