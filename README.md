# Multi-User Chat Application

This is a Java-based multi-user chat application that allows users to communicate in real-time. The application includes functionality for maintaining a chat history and viewing it later.

## Features

- Real-time multi-user chat.
- Chat history is logged with timestamps and can be viewed.
- Separate threads for handling each client connection.
- Synchronized chat logging to avoid data corruption.

## Project Structure

```
- Client.java                  // Handles client-side operations.
- Server.java                  // Starts the server and manages client connections.
- ClientHandler.java           // Manages individual client connections on the server.
- ChatHistory.java             // Handles chat history logging and retrieval.
- ChatHistoryViewer.java       // Displays the chat history.
```

## Prerequisites

- Java Development Kit (JDK) 8 or later

## How to Run

1. **Compile the Files:**
   ```
   javac *.java
   ```

2. **Start the Server:**
   ```
   java Server
   ```

3. **Start the Clients:**
   Open multiple terminal windows and run:
   ```
   java Client
   ```
   Enter a username when prompted to join the chat.

4. **View Chat History:**
   Run the following command to view the chat history:
   ```
   java ChatHistoryViewer
   ```

## Functions

### 1. Client
- **Purpose:** Handles the client-side operations like connecting to the server, sending messages, and listening for incoming messages.
- **Key Methods:**
  - `SendMessage()` - Sends messages to the server.
  - `ListenForMessage()` - Listens for messages from the server.
  - `closeEverything()` - Closes all resources when the connection is terminated.

### 2. Server
- **Purpose:** Starts the server, accepts client connections, and spawns threads to handle them.
- **Key Methods:**
  - `startServer()` - Listens for and accepts client connections.
  - `closeServerSocket()` - Closes the server socket.

### 3. ChatHistory
- **Purpose:** Logs and retrieves the chat history.
- **Key Methods:**
  - `logMessage(String username, String message)` - Logs a message to the chat history file.
  - `displayChatHistory()` - Displays the chat history.

## Dependencies

This application does not rely on any external libraries or frameworks.

