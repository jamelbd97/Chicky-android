package tn.esprit.chicky.adapters;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.chicky.R
import tn.esprit.chicky.models.Comment

class CommentAdapter(var items: MutableList<Comment>) :
    RecyclerView.Adapter<CommentAdapter.ConversationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_comment, parent, false)
        return ConversationViewHolder(view)
    }

    override fun onBindViewHolder(holder: ConversationViewHolder, position: Int) {
        holder.bindView(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ConversationViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        private val conversationNameTV: TextView = itemView.findViewById(R.id.conversationNameTV)
        private val lastMessageTV: TextView = itemView.findViewById(R.id.lastMessageTV)

        fun bindView(item: Comment) {

            itemView.setOnClickListener {

            }

            conversationNameTV.text = "User : " + item.userEmail
            lastMessageTV.text = item.description
        }
    }
}