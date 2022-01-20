# Basis_Assignment✨
Assignment given by Basis Company

<!-- ![Green and Cream Modern Sales Marketing Presentation](https://user-images.githubusercontent.com/86509987/150291229-f3412fc2-d84a-44aa-a6a4-7b1215c45879.png)
 -->

# Click On Demo✨
  <code>
    <a href="https://drive.google.com/drive/folders/1sTKJfDciXCnqSBL5LLCYjqv-_xsyYd-5?usp=sharing" title="Playstore Profile"><img height="140" width="140" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgwJcz642pA7mLR5u44OirKSJjfxOoOqWbpNx7vgDP0NI4snSp68daLp-JccwzoGUIARw&usqp=CAU"></a></code>


# Things we used while making this application✨
* MVVM-Architecture
* GitHub
* Recycler View
* Retrofit Library
* Glide
* Dependency Injection-Hilt
* Navigation
* Coroutines
* RxJava

# Teck-stack✨
* Android Studio
* Kotlin


# Clone this Repo To Your System Using Android Studio✨

* Step 1: Open your Android Studio then go to the File > New > Project from Version Control as shown in the below image.
* Step 2: After clicking on the Project from Version Control a pop-up screen will arise like below. In the Version control choose Git from the drop-down menu.
* Step 3: Then at last paste this (https://github.com/Prachip9767/Basis_Assignment.git ) link in the URL and choose your Directory. Click on the Clone button and you are done.


# Clone this Repo To Your System Using GitBash✨

* Open Git Bash

* If Git is not already installed, it is super simple. Just go to the Git Download Folder and follow the instructions.

* Go to the current directory where you want the cloned directory to be added.

* To do this, input cd and add your folder location. You can add the folder location by dragging the folder to Git bash.

* Go to the page of the repository that you want to clone

* Click on “Clone or download” and copy the URL.

* Use the git clone command along with the copied URL from earlier. $ git clone https://github.com/Prachip9767/Basis_Assignment.git

* Press Enter. $ git clone https://github.com/Prachip9767/Basis_Assignment.git Cloning into Git … remote: Counting objects: 13, done. remote: Compressing objects: 100% (13/13), done. remove: Total 13 (delta 1), reused 0 (delta 1) Unpacking objects: 100% (13/13), done.

Congratulations, you have created your first local clone from your remote Github repository.


# Dependencies and Plugins✨
Project level dependencies

      //hilt
      classpath 'com.google.dagger:hilt-android-gradle-plugin:2.38.1'

App level dependencies
          
          //dataBinding
           buildFeatures {
            viewBinding true
        }

    // ViewModel and LiveData
    def arch_version = '2.2.0-alpha01'
    implementation "androidx.lifecycle:lifecycle-extensions:$arch_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$arch_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$arch_version"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:$arch_version"
    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0-alpha03'

    //Retrofit
    def retrofit2_version = "2.9.0"
    def okhttp3_version = "4.9.0"
    //retrofit
    implementation "com.squareup.retrofit2:retrofit:$retrofit2_version"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit2_version"
    implementation 'com.squareup.retrofit2:converter-scalars:2.1.0'

    //Okhttp3
    implementation "com.squareup.okhttp3:okhttp:$okhttp3_version"

    //hilt
    implementation("com.google.dagger:hilt-android:2.38.1")
    kapt("com.google.dagger:hilt-android-compiler:2.38.1")

    implementation 'me.relex:circleindicator:2.1.6'

    //RXjava
    implementation 'io.reactivex.rxjava3:rxjava:3.1.2'
    implementation 'io.reactivex.rxjava3:rxandroid:3.0.0'
    implementation 'com.squareup.retrofit2:adapter-rxjava3:2.9.0'
 
    def anko_version = '0.10.0'
    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.0'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.2'
    implementation "org.jetbrains.anko:anko-commons:$anko_version"
    

      Plugins
          id 'kotlin-kapt'
          id("androidx.navigation.safeargs")
          id 'dagger.hilt.android.plugin'
    
    
# Thank You✨
