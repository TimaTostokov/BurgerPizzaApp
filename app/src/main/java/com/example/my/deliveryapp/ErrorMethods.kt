package com.example.my.deliveryapp

//    private fun SetTextColor() {
//        class ButtonAdapter (
//            private val context: Context,
//            private val buttonList: ArrayList<Button>,
//            var onClick: (Button) -> Unit) : RecyclerView.Adapter<ButtonAdapter.ButtonViewHolder>(){
//
//            private var selectedPosition = RecyclerView.NO_POSITION
//
//            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ButtonViewHolder {
//                val binding = ItemButtonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//                return ButtonViewHolder(binding)
//            }
//
//            override fun onBindViewHolder(holder: ButtonViewHolder, position: Int) {
//                holder.onBind(buttonList[position])
//
//                if (position == selectedPosition) {
//                    val selectedColor = ContextCompat.getColor(context, R.color.yellow)
//
//                    holder.binding.textForButton.apply {
//                        setBackgroundColor(selectedColor)
//                        setTextColor(ContextCompat.getColor(context, R.color.white_100))
//                    }
//                    holder.itemView.backgroundTintList = ContextCompat.getColorStateList(context, R.color.yellow)
//                } else {
//                    val defaultColor = ContextCompat.getColor(context, R.color.white_100)
//                    holder.binding.textForButton.apply {
//                        setBackgroundColor(defaultColor)
//                        setTextColor(ContextCompat.getColor(context, R.color.green))
//                    }
//                    holder.itemView.backgroundTintList = ContextCompat.getColorStateList(context, R.color.white_100)
//                }
//
//                holder.itemView.setOnClickListener {
//                    onClick(buttonList[position])
//
//                    val previousSelectedPosition = selectedPosition
//                    selectedPosition = holder.adapterPosition
//
//                    if (previousSelectedPosition != RecyclerView.NO_POSITION) {
//                        notifyItemChanged(previousSelectedPosition)
//                    }
//
//                    notifyItemChanged(selectedPosition)
//                }
//            }
//
//            override fun getItemCount(): Int {
//                return buttonList.size
//            }
//
//            inner class ButtonViewHolder(val binding: ItemButtonBinding) : RecyclerView.ViewHolder(binding.root) {
//
//                fun onBind(button: Button) {
//                    binding.textForButton.text = button.text
//                    binding.iconDelivery.isVisible = button.hasIcon
//                }
//            }
//        }
//    }