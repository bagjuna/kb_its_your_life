# Dialog에 ScrollView,View
from turtle import Screen
from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.button import Button
from kivy.uix.label import Label
from kivy.uix.screenmanager import Screen, ScreenManager
from kivy.uix.scrollview import ScrollView
from kivy.uix.popup import Popup

class MyScreen(Screen):
    def __init__(self, **kwargs):
        super(MyScreen, self).__init__(**kwargs)
        layout = BoxLayout(orientation='vertical')
        btn = Button(text='Open Dialog', size_hint=(1, 0.1))
        btn.bind(on_release=self.open_dialog)
        layout.add_widget(btn)
        self.add_widget(layout)

    def open_dialog(self, instance):
        content = ScrollView(size_hint=(1, 0.9))
        box = BoxLayout(orientation='vertical', size_hint_y=None)
        box.bind(minimum_height=box.setter('height'))

        for i in range(20):
            box.add_widget(Label(text=f'Label {i + 1}', size_hint_y=None, height=40))

        content.add_widget(box)
        dialog = Dialog(title='Scrollable Dialog', content=content, size_hint=(0.8, 0.8))
        dialog.open()
