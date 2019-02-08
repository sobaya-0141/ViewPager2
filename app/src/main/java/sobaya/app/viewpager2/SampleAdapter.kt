package sobaya.app.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.adapter_sample_item.view.*

class SampleAdapter(val items: List<PagerItem>): RecyclerView.Adapter<SampleAdapter.SampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SampleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_sample_item, parent, false)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        val item = items[position]
        holder.itemView.imageView.apply {
            Picasso.with(context).load(item.image).into(this)
        }
    }

    class SampleViewHolder(view: View): RecyclerView.ViewHolder(view)
}