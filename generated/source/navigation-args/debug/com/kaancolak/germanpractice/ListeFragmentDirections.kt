package com.kaancolak.germanpractice

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class ListeFragmentDirections private constructor() {
  public companion object {
    public fun actionListeFragmentToKelimelerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listeFragment_to_kelimelerFragment)
  }
}
