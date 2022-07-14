package ui.magicmaininfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.hiberustest.magiccards.R
import com.hiberustest.magiccards.databinding.FragmentMagicMainInfoBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MagicMainInfoFragment : Fragment() {

    private var _binding: FragmentMagicMainInfoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMagicMainInfoBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToList.setOnClickListener {
            var navController = Navigation.findNavController(requireView())
            navController.navigate(R.id.action_FragmentMagicMainInfo_to_FragmentMagicList)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}