package com.example.gamelist


import android.annotation.SuppressLint
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gamelist.ui.theme.GamelistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App(){
    GamelistTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
              SimpleCenterAlignedTopAppBar()

            }
        }
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 700)
@Composable
fun AppPreview() {
    App()
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleCenterAlignedTopAppBar() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Gray
                ),
                title = {
                    Text(
                        "App super seguro",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.ExitToApp,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        }
        ,
 content = {
    // Adicionando um Column para conter o FormLayoutFilled e o ButtonSample
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FormLayoutFilled()
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* Handle the send action here */ },
            colors = ButtonDefaults.run { buttonColors(Color.Red) }) {
            Text(text = "Enviar")
        }
    }
}
)
}

@Preview(showBackground = true, widthDp = 400, heightDp = 700)
@Composable
fun CombinedLayoutPreview() {
    SimpleCenterAlignedTopAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormLayoutFilled() {
    val focusManager = LocalFocusManager.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 56.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            modifier = Modifier.widthIn(max = 480.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(vertical = 24.dp)
        ) {
            item {
                var text by remember { mutableStateOf("") }
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    label = { Text("Nome completo") },
                    value = text,
                    onValueChange = { text = it },
                    singleLine = true,
                    trailingIcon = {
                        AnimatedVisibility(
                            visible = text.isNotBlank(),
                            enter = fadeIn(),
                            exit = fadeOut()
                        ) {
                            IconButton(onClick = { text = "" }) {
                                Icon(Icons.Outlined.Clear, "Clear")
                            }
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next,
                        capitalization = KeyboardCapitalization.Words
                    ),
                    keyboardActions = KeyboardActions {
                        focusManager.moveFocus(FocusDirection.Next)
                    }
                )

            }
            item { Spacer(Modifier.height(4.dp)) }
            item {
                var text by remember { mutableStateOf("") }
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    label = { Text("Telefone") },
                    value = text,
                    onValueChange = { text = it },
                    trailingIcon = {
                        AnimatedVisibility(
                            visible = text.isNotBlank(),
                            enter = fadeIn(),
                            exit = fadeOut()
                        ) {
                            IconButton(onClick = { text = "" }) {
                                Icon(Icons.Outlined.Clear, "Clear")
                            }
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions {
                        focusManager.moveFocus(FocusDirection.Next)
                    },
                    singleLine = true,
                )
            }
            item { Spacer(Modifier.height(4.dp)) }
            item { ExposedDropdownMenuSample()
            }
            item { Spacer(Modifier.height(4.dp)) }
            item {
                val text = rememberSaveable { mutableStateOf("") }
                TextField(
                    value = text.value,
                    onValueChange = { text.value = it }, modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(10.dp)
                        .border(width = 1.dp, color = Color.Transparent, shape = RoundedCornerShape(8.dp))
                )
            }
            item { Spacer(Modifier.height(4.dp)) }
            item {Row {

                Button(
                    onClick = { /* Do something! */ },
                    contentPadding = ButtonDefaults.ButtonWithIconContentPadding,
                    modifier = Modifier.padding(horizontal = 50.dp)
                ) {
                    Text("  Cadastrar")
                }

                Button(
                    onClick = { /* Do something! */ },
                    contentPadding = ButtonDefaults.ButtonWithIconContentPadding,
                    modifier = Modifier.padding(horizontal = 42.dp)
                ) {
                    Text("  Cancelar")
                }

            }

          }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun ExposedDropdownMenuSample() {
    val options = listOf("Selecione", "Telefone fixo", "Celular", "whatsapp")
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[0]) }
    // We want to react on tap/press on TextField to show men
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded },

    ) {
        TextField(
            // The `menuAnchor` modifier must be passed to the text field for correctness.
            modifier = Modifier.menuAnchor().padding(horizontal = 50.dp),
            readOnly = true,
            value = selectedOptionText,
            onValueChange = {},
            label = { Text("Origem") },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            options.forEach { selectionOption ->
                DropdownMenuItem(
                    text = { Text(selectionOption) },
                    onClick = {
                        selectedOptionText = selectionOption
                        expanded = false
                    },
                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                )
            }
        }
    }
}