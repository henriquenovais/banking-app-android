package com.example.bankapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bankapp.components.FormVelox
import com.example.bankapp.databinding.FragmentVeloxFormBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [VeloxFormFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VeloxFormFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var _binding: FragmentVeloxFormBinding? = null
    private val binding get() = _binding!!

    //region Fragment Life Cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentVeloxFormBinding.inflate(inflater, container, false)
        val view = binding
        view.composeViewVeloxForm.setContent {
           FormVelox()
        }
        return view.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonPreviousVeloxForm.setOnClickListener {
            findNavController().navigate(R.id.action_veloxFormFragment_to_SecondFragment)
        }
        binding.buttonNextVeloxForm.setOnClickListener {
            val toast = Toast.makeText(context, "GOOD STUFF IS HAPPENING BOYZ", Toast.LENGTH_SHORT)
            toast.show()
        }

    }

    //endregion

    //region Init View Components


    //endregion

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment VeloxFormFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            VeloxFormFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}