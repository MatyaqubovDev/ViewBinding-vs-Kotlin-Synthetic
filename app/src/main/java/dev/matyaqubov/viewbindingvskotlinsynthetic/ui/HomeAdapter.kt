package dev.matyaqubov.viewbindingvskotlinsynthetic.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.matyaqubov.viewbindingvskotlinsynthetic.databinding.HomeItemBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.VH>() {

    inner class VH(val binding: HomeItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            binding.apply {
                tvMana.text="Alisher"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(HomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind()

    override fun getItemCount(): Int {
        //just 12
        return 12

    }
}