# CMS 270 Project Starter (Java + Swing + JUnit 5)

This repository runs entirely in your browser with **GitHub Codespaces**. You do not need to install Java, Maven, or an IDE on your own computer.

## 1. Make your own copy

Do this once. Skip it if you've already made your copy.

1. Sign in to GitHub. (Free account. If you haven't yet, apply for the [GitHub Student Developer Pack](https://education.github.com/pack); it raises your monthly Codespaces hours.)
2. Open the template link from Canvas and click the green **Use this template** button → **Create a new repository**.
3. Name it `cms270-project`, choose **Private**, and click **Create repository**.
4. Make sure you're on **your** copy now (the page shows `your-username/cms270-project`) before going on.

## 2. Open your Codespace

1. On **your copy's** GitHub page, click the green **Code** button.
2. Choose the **Codespaces** tab, then **Create codespace on main**.
3. Wait for setup to finish (the first time takes 2-4 minutes). You'll get VS Code in your browser with Java already installed.

To come back later, go to [github.com/codespaces](https://github.com/codespaces) and open the same codespace. Don't create a new one each time.

> Codespaces stop after 30 minutes of inactivity, and your free hours are limited. When you're done for the day, **commit and push** your work, then stop the codespace from github.com/codespaces.

## 3. Project layout

```
src/main/java/edu/rollins/cms270/        your logic classes (no Swing here)
src/main/java/edu/rollins/cms270/gui/    your Swing windows and panels
src/main/java/edu/rollins/cms270/App.java  the main method
src/test/java/edu/rollins/cms270/        your JUnit tests
pom.xml                                   build settings (JUnit 5, Mockito, coverage)
```

The `Counter`, `CountListener`, `MainWindow`, and `CounterTest` classes are a small working example. Run them once to confirm everything works, then replace them with your own project.

## 4. Run the tests

Any of these work:

- Click the **Testing** icon (the flask) in the left sidebar, then the **Run All** button.
- Click the green ▶ next to any test method or test class.
- In the terminal: `mvn test`

## 5. Check your code coverage (70% requirement)

**Option A: in the editor.** In the Testing sidebar, click **Run Tests with Coverage**. Covered lines turn green, missed lines red, and a coverage summary appears. Screenshot it for your submission.

**Option B: the full report.** In the terminal run:

```bash
mvn clean test
```

Then in the file explorer, right-click `target/site/jacoco/index.html` and choose **Show Preview** (or **Download** and open it on your computer). Screenshot the summary table.

Classes in the `gui` package and `App` are left out of the coverage numbers, since the 70% requirement is about your logic classes.

## 6. Run the program and see your GUI

A codespace has no screen of its own, so Swing windows open on a small virtual desktop that you view in a browser tab.

1. Open the **Ports** tab (next to Terminal at the bottom). Find **GUI Desktop** on port **6080**.
2. Hover over the address and click the globe icon (**Open in Browser**).
3. Click **Connect**. The password is `vscode`.
4. Back in VS Code, open `App.java` and click **Run** above `main` (or press F5, or run `mvn compile exec:java` in the terminal).
5. Switch to the desktop tab. Your window is there.

Keep the desktop tab open while you work; each time you run the program, the window shows up there. If you close the window, the program ends.

Tip: in the desktop tab, the noVNC sidebar on the left has a setting to **scale** the view if it looks too big or too small.

## 7. Save your work (commit and push)

Your work is only safe once it's pushed to GitHub.

1. Click the **Source Control** icon in the left sidebar (the branching lines).
2. Type a short message describing what you changed, like `Add Expense class and tests`.
3. Click **Commit**, then **Sync Changes**.

Or in the terminal:

```bash
git add .
git commit -m "Describe what you changed"
git push
```

Commit small and often. It's your backup, and it shows your progress.

## 8. Renaming the package (optional)

If you want a different package name than `edu.rollins.cms270`, right-click the package folder and use **Rename**; VS Code updates the `package` lines for you. If you move or rename `App`, also update `<exec.mainClass>` in `pom.xml` and `mainClass` in `.vscode/launch.json`.

## Troubleshooting

| Problem | Fix |
| --- | --- |
| Red squiggles everywhere right after opening | Java is still loading. Wait for the "Java: Ready" message in the bottom status bar. |
| Still broken after a `pom.xml` change | Command Palette (`Ctrl+Shift+P` / `Cmd+Shift+P`) → **Java: Clean Java Language Server Workspace** → Restart. |
| `HeadlessException` or "No X11 DISPLAY" | Open a **new** terminal (the old one may predate the desktop starting) and run again. If it persists, Command Palette → **Codespaces: Rebuild Container**. |
| Port 6080 isn't listed | Ports tab → **Forward a Port** → type `6080`. |
| Window doesn't appear | Make sure you're looking at the desktop browser tab, not VS Code. Check that `setVisible(true)` is called. |
| Tests don't show in the Testing sidebar | Test classes must be in `src/test/java` and test methods need `@Test`. |
