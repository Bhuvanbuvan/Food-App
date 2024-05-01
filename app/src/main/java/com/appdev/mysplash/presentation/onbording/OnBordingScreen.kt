package com.appdev.mysplash.presentation.onbording

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.appdev.mysplash.presentation.common.FoodButton
import com.appdev.mysplash.presentation.common.FoodTextButton
import com.appdev.mysplash.presentation.onbording.components.Indicator
import com.appdev.mysplash.presentation.onbording.components.OnBordingPage
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBordingScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        val pagerState= rememberPagerState(initialPage = 0) {
            page.size
        }

        val buttonState= remember {
            derivedStateOf {
                when(pagerState.currentPage){
                    0-> listOf("","Next")
                    1-> listOf("Back","Next")
                    2-> listOf("Back","Get Started")
                    else-> listOf("","")
                }
            }
        }
        
        HorizontalPager(state = pagerState) {index->
            OnBordingPage(pages = page[index])
        }
        
        Spacer(modifier = Modifier.weight(1f))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {

            Indicator(
                modifier = Modifier.width(52.dp),
                pageSize = page.size, selectedPage = pagerState.currentPage
            )


            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                val scope = rememberCoroutineScope()
                if (buttonState.value[0].isNotEmpty()) {
                    FoodTextButton(text = buttonState.value[0]) {
                        scope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage - 1)
                        }
                    }
                }
                FoodButton(text = buttonState.value[1]) {
                    scope.launch {
                        if (pagerState.currentPage == 3) {
                            //TODO : goto HomePage
                        } else {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.weight(0.5f))
    }
}