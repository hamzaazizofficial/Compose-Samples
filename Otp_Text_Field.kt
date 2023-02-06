# Otp Text Field Design by Hamza Aziz

@Composable
fun OtpTextField(
    modifier: Modifier = Modifier,
    otpText: String,
    otpCount: Int = 5,
    onOtpTextChange: (String, Boolean) -> Unit,
) {
    BasicTextField(
        modifier = modifier,
        value = otpText,
        onValueChange = {
            if (it.length <= otpCount) {
                onOtpTextChange.invoke(it, it.length == otpCount)
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        decorationBox = {
            Row(horizontalArrangement = Arrangement.Center) {
                repeat(otpCount) { index ->
                    CharView(
                        index = index,
                        text = otpText
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }
    )
}

@Composable
private fun CharView(
    index: Int,
    text: String,
) {
    val isFocused = text.length == index
    val char = when {
        index == text.length -> ""
        index > text.length -> ""
        else -> text[index].toString()
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            fontSize = 36.sp,
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .border(
                    1.dp, when {
                        isFocused -> Color.DarkGray
                        else -> Color.LightGray
                    }, RoundedCornerShape(8.dp)
                )
                .padding(2.dp),
            text = char,
            color = if (isFocused) {
                Color.LightGray
            } else {
                Color.DarkGray
            },
            textAlign = TextAlign.Center
        )
    }
}
