import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.app.R
import kotlinx.android.synthetic.main.flower_item.view.*

class RVAAdapterStudent(private val context: Context, private val arrayList: ArrayList<Students>) : RecyclerView.Adapter<RVAAdapterStudent.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.activity_scrore,parent,false))
    }

    override fun getItemCount(): Int = arrayList!!.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.view.iddp.text = arrayList?.get(position)?.id.toString()
        holder.view.dp.text = "Rp "+arrayList?.get(position)?.dp

    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)

}