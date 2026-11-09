# 🎵 Java Music Player

### A Simple Console-Based Audio Player Using Java

A lightweight music player developed using **Core Java and the Java Sound API**, featuring basic playback controls through an interactive command-line interface.

---

## 🌟 Features

- ▶️ **Start / Resume:** Play or resume audio playback.
- ⏸️ **Pause:** Temporarily stop audio playback.
- 🔄 **Reset:** Restart playback from the beginning.
- ❌ **Quit:** Stop playback and close the audio resource.
- 🎧 **Audio Support:** Supports WAV, AU, and AIFF audio formats through Java Sound.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Application development |
| Java Sound API | Audio playback |
| Scanner | User input handling |
| IntelliJ IDEA / VS Code | Development environment |

## 📂 Project Structure

```text
Java-Music-Player/
│
├── MusicPlayer.java
└── README.md
```

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/merwin-antony/Music-Player.git
```

### 2. Open the Project

Open the project in IntelliJ IDEA or VS Code.

### 3. Add Your Audio File

Update the following line in `MusicPlayer.java`:

```java
String filepath = "ADD_YOUR_AUDIO_FILE_HERE";
```

Replace the placeholder with the path to your audio file.

Example:

```java
String filepath = "C:/Users/Username/Music/song.wav";
```

### 4. Compile the Program

```bash
javac MusicPlayer.java
```

### 5. Run the Application

```bash
java MusicPlayer
```

## 🎮 Available Controls

| Key | Action |
|---|---|
| `S` | Start / Resume playback |
| `P` | Pause playback |
| `R` | Reset to beginning |
| `Q` | Quit the player |
