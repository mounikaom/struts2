<!DOCTYPE html>
<html>
<head>

  <meta name="description" content="Simplest possible examples of HTML, CSS and JavaScript." />
  <meta name="author" content="//samdutton.com">  <meta name="viewport" content="width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes">
  <meta itemprop="name" content="simpl.info: simplest possible examples of HTML, CSS and JavaScript">
  <meta itemprop="image" content="/images/icons/icon192.png">
  <meta name="mobile-web-app-capable" content="yes">
  <meta id="theme-color" name="theme-color" content="#fff">

  <base target="_blank">

  <title>RTCPeerConnection</title>

  <link rel="stylesheet" href="../css/main.css" />

  <style>
    button {
      margin: 0 20px 0 0;
      width: 85.9px;
    }
    button#hangupButton {
      margin: 0;
    }
    p.borderBelow {
      margin: 0 0 1.5em 0;
      padding: 0 0 1.5em 0;
    }
    video {
      height: 225px;
      margin: 0 0 20px 0;
      vertical-align: top;
      width: calc(50% - 13px);
    }
    video#localVideo {
      margin: 0 20px 20px 0;
    }
    @media screen and (max-width: 400px) {
      button {
        width: 83px;
      }
      button {
        margin: 0 11px 10px 0;
      }
      video {
        height: 90px;
        margin: 0 0 10px 0;
        width: calc(50% - 7px);
      }
      video#localVideo {
        margin: 0 10px 20px 0;
      }
    }
  </style>

</head>

<body>


  <div id="container">

    <h1>Telemedicine</h1>

    <!-- <p>Check out the complete set of WebRTC demos at <a href="https://webrtc.github.io/samples/" title="WebRTC samples GitHub Pages">webrtc.github.io/samples</a>.</p> -->

    <div id="highlight">
      <!-- <p>New codelab: <a href="https://codelabs.developers.google.com/codelabs/webrtc-web">Realtime communication with WebRTC</a></p> -->
    </div>

    <video id="localVideo" autoplay ></video>
    <video id="remoteVideo" autoplay></video>

    <div>
      <button id="startButton">Start</button>
      <button id="callButton">Call</button>
      <button id="hangupButton">Hang Up</button>
    </div>

    <p>View the console to see logging. The <code>MediaStream</code> object <code>localStream</code>, and the <code>RTCPeerConnection</code> objects <code>localPeerConnection</code> and <code>remotePeerConnection</code> are in global scope, so you can inspect them in the console as well.</p>

    <p>For more information about RTCPeerConnection, see <a href="http://www.html5rocks.com/en/tutorials/webrtc/basics/" title="HTML5 Rocks article about WebRTC by Sam Dutton">Getting Started With WebRTC</a>.</p>

    <script src="js/main.js"></script>
    <script src="js/ga.js"></script>

    <!-- <a href="https://github.com/samdutton/simpl/blob/master/rtcpeerconnection/index.html" title="View source for this page on GitHub" id="viewSource">View source on GitHub</a>
 -->
  </div>


</body>

</html>
