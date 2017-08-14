# AndroidJs
웹뷰와 자바스크립트 통신

 Webview in Android is like hybrid App.
 
 Javascript in webview deals with fuction in native android App.
 
 
 This is simple html code.
 
<input type="button" value="click" onClick="showAndroidToast('im parameter value')" />

<script type="text/javascript">
    function showAndroidToast(toast) {
        Android.showToast(toast);
    }
</script>

This is From
http://202psj.tistory.com/923 [알레폰드의 IT 이모저모]



