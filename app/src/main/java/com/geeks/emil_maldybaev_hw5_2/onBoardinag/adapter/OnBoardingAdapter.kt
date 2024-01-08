package com.geeks.emil_maldybaev_hw4_2.ui.onBoardinag.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geeks.emil_maldybaev_hw5_2.R
import com.geeks.emil_maldybaev_hw5_2.databinding.ItemOnboardingBinding
import com.geeks.emil_maldybaev_hw5_2.model.OnBoarding

class OnBoardingAdapter(private val onClick: () -> Unit) :
    Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {
    private val list = arrayListOf<OnBoarding>(
        OnBoarding(
            R.raw.qrcode,
            "qwqwqw",
            "qwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwq"
        ),
        OnBoarding(
            R.raw.qrcode,
            "Lala",
            "LALALALALLALALALLALALAL"
        ),
        OnBoarding(
            R.raw.qrcode,
            "trtrtrtr",
            "trtrtrtrtrtrtrtrtrtrtrtrtttrtr"
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(
            ItemOnboardingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind((list.get(position)))
    }

    inner class OnBoardingViewHolder(private val binding: ItemOnboardingBinding) :
        ViewHolder(binding.root) {
        fun bind(boarding: OnBoarding) {
            binding.tvTitle.text = boarding.title
            binding.tvDesc.text = boarding.desc
            boarding.image?.let { binding.ivBoard.setAnimation(it) }
            //Glide.with(binding.ivBoard.context).load(boarding.image).into(binding.ivBoard)
            binding.btnStart.isVisible = adapterPosition == list.lastIndex
            binding.tvSkip.isVisible = adapterPosition != list.lastIndex
            binding.tvSkip.setOnClickListener { onClick() }
            binding.btnStart.setOnClickListener { onClick() }
        }
    }

}
