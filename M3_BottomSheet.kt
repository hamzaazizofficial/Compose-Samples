# Otp Selection Bottom Sheet by Hamza Aziz


 var bottomSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
    )
 val scope = rememberCoroutineScope()

   ModalBottomSheetLayout(
       sheetShape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
       sheetState = bottomSheetState,
       sheetContent = {
           ResetSelectionBottomSheet(navController)
       }) {
     Column{
       .......
       clickable { scope.launch{ bottomSheetState.show() }
     }}
     
     
@Composable
fun ResetSelectionBottomSheet(navController: NavHostController) {
    Surface {
        ElevatedCard {

            Spacer(modifier = Modifier.padding(10.dp))

            Text(
                textAlign = TextAlign.Start,
                text = "Make Selection!",
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp, end = 10.dp),
            )

            Spacer(modifier = Modifier.padding(4.dp))

            Text(
                textAlign = TextAlign.Start,
                text = "Select one of the options given below to reset your password.",
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp, end = 10.dp),
            )

            Spacer(modifier = Modifier.padding(10.dp))

            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(horizontal = 16.dp)
                    .clickable { navController.navigate("emailotp") }
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Spacer(modifier = Modifier.padding(10.dp))
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.padding(6.dp))

                        Column {
                            Text(
                                textAlign = TextAlign.Start,
                                text = "E-mail",
                                color = Color.Black,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 14.sp
                            )

                            Spacer(modifier = Modifier.padding(4.dp))

                            Text(
                                textAlign = TextAlign.Start,
                                text = "Reset via Mail Verification.",
                                color = Color.Black,
                                fontWeight = FontWeight.Light,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.padding(10.dp))

            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(horizontal = 16.dp)
                    .clickable { }
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Spacer(modifier = Modifier.padding(10.dp))
                        Icon(
                            imageVector = Icons.Default.Phone,
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.padding(6.dp))

                        Column {
                            Text(
                                textAlign = TextAlign.Start,
                                text = "Phone Number",
                                color = Color.Black,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 14.sp
                            )

                            Spacer(modifier = Modifier.padding(4.dp))

                            Text(
                                textAlign = TextAlign.Start,
                                text = "Reset via Phone Verification.",
                                color = Color.Black,
                                fontWeight = FontWeight.Light,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
        }
    }
}
     
     
