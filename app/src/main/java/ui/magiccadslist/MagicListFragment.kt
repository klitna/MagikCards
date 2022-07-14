package ui.magiccadslist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.hiberustest.magiccards.R
import com.hiberustest.magiccards.databinding.FragmentMagicListBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MagicListFragment : Fragment() {

    private var _binding: FragmentMagicListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMagicListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToCardInfo.setOnClickListener {
            var navController = Navigation.findNavController(requireView())
            navController.navigate(R.id.action_FragmentMagicList_to_FragmentMagicCardInfo)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}