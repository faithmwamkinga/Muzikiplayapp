package com.displaynumbers.muzikiplayapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.displaynumbers.muzikiplayapp.databinding.ActivityMainBinding
import com.displaynumbers.muzikiplayapp.databinding.MusicListBinding

class RecyclerViewAdapter (var musicList: List<MusicListBinding>):RecyclerView.Adapter<MusicDataViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicDataViewHolder {
        var binding=MusicListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
         return MusicDataViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MusicDataViewHolder, position: Int) {
     var musics=musicList[position]
        holder.binding.apply {

            tvMusic.text=musics.
            tvMusic1Name.text=musics.music
            tvName.text=musics.toString()
            tvGenre.text=musics.toString()
            tvAlbum.text=musics.toString()
            tvYear.text=musics.toString()

        }
    }

    override fun getItemCount(): Int {
     return musicList.size
    }
}



class MusicDataViewHolder(var binding: MusicListBinding):RecyclerView.ViewHolder(binding.root){

}
